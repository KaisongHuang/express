package logic.financebl;

import java.io.File;
import java.io.FileOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.*;

import _enum.Operation;
import _enum.ResultMessage;
import data.admindata.AdminData;
import data.datafactory.DataFactory;
import data.financedata.FinanceData;
import logic.financeblservice.FinanceBlService;
import po.AccountPO;
import po.PayPO;
import po.ReceiptPO;
import vo.AccountVO;
import vo.PayVO;
import vo.ReceiptVO;

public class Finance implements FinanceBlService {
	FinanceData fd ;
	AdminData ad ;
	private int count;

	public Finance(){
		fd=DataFactory.getFinanceDataService();
		ad=DataFactory.getAdminDataService();
	}
	public ResultMessage createCost(PayVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		PayPO po = new PayPO(vo.getDate(), vo.getPayer(), vo.getPayAccount(), vo.getEntry(), vo.getComments(),
				vo.getCost(), vo.getIsCheck());
		try {
			rm = fd.insert(po);
		} catch (RemoteException e) {
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

	public ArrayList<Object> getTotal(String begin, String end) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = new ArrayList<Object>();
		ArrayList<PayPO> pay = new ArrayList<PayPO>();
		ArrayList<ReceiptPO> receipt = new ArrayList<ReceiptPO>();
		try {
			pay = fd.findPay(begin, end);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			receipt = fd.findReceipt(begin, end);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("haidhfdhbfjd"+receipt.size());

		this.count = pay.size();

		for (int i = 0; i < pay.size(); i++)
			arr.add(new PayVO(pay.get(i).getDate(), pay.get(i).getPayer(), pay.get(i).getPayAccount(),
					pay.get(i).getEntry(), pay.get(i).getComments(), pay.get(i).getCost(), pay.get(i).getIsCheck()));

		for (int i = 0; i < receipt.size(); i++)
			arr.add(new ReceiptVO(receipt.get(i).getMoney(), receipt.get(i).getDate(), receipt.get(i).getSellingArea(),
					receipt.get(i).getNumber(), receipt.get(i).getId(), receipt.get(i).getIsCheck()));

		return arr;
	}

	public ResultMessage manageAccount(AccountVO vo, Operation op) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		AccountPO po = new AccountPO(vo.getBankAccount(), vo.getBalance());
		if (op == Operation.insert) {
			try {
				rm = fd.insert(po);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		} else if (op == Operation.delete) {
			try {
				rm = fd.delete(po);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		} else if (op == Operation.update) {
			try {
				rm = fd.update(po);
			} catch (RemoteException e) {
				e.printStackTrace();
				rm = ResultMessage.FunctionError;
			}
		}
		return rm;
	}

	public ArrayList<AccountVO> findAccount(String bankAccount) {
		// TODO Auto-generated method stub
		ArrayList<AccountVO> vo = new ArrayList<AccountVO>();
		ArrayList<AccountPO> total = new ArrayList<AccountPO>();
		try {
			total = fd.findAccount();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < total.size(); i++) {
			if (total.get(i).getBankAccount().contains(bankAccount))
				vo.add(new AccountVO(total.get(i).getBankAccount(), total.get(i).getBalance()));
		}

		return vo;
	}

	public ArrayList<ReceiptVO> checkReceipt(String date, String sellingArea) {
		// TODO Auto-generated method stub
		ArrayList<ReceiptPO> arr = new ArrayList<ReceiptPO>();
		ArrayList<ReceiptVO> vo = new ArrayList<ReceiptVO>();
		try {
			arr = fd.checkReceipt(date, sellingArea);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < arr.size(); i++) {
			vo.add(new ReceiptVO(arr.get(i).getMoney(), arr.get(i).getDate(), arr.get(i).getSellingArea(),
					arr.get(i).getNumber(), arr.get(i).getId(), arr.get(i).getIsCheck()));
		}

		return vo;
	}

	public ResultMessage initAccount(AccountVO vo) {
		// TODO Auto-generated method stub
		/*********** needs to be modified when adding listener *********/
		ResultMessage rm = null;
		AccountPO po = new AccountPO(vo.getBankAccount(), vo.getBalance());
		try {
			rm = fd.InitInsert(po);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

	public ArrayList<AccountVO> checkInitInfo() {
		ArrayList<AccountPO> po = new ArrayList<AccountPO>();
		ArrayList<AccountVO> vo = new ArrayList<AccountVO>();
		try {
			po = fd.findInitInfo();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < po.size(); i++) {
			vo.add(new AccountVO(po.get(i).getBankAccount(), po.get(i).getBalance()));
		}
		return vo;
	}

	public int getCount() {
		return count;
	}

	public ResultMessage clearAccount() {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		try {
			rm = fd.clear();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

	public void exportCostAndReceive(String in, String out, String all) {
		HSSFWorkbook wb = new HSSFWorkbook();
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		HSSFSheet sheet = wb.createSheet("成本收益表");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		HSSFRow row = sheet.createRow((int) 0);
		// 第四步，创建单元格，并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("收入");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("支出");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("总收入");
		cell.setCellStyle(style);

		// 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		// List list = CreateSimpleExcelToDisk.getStudent();

		row = sheet.createRow(1);

		// 第四步，创建单元格，并设置值
		row.createCell((short) 0).setCellValue(in);
		row.createCell((short) 1).setCellValue(out);
		row.createCell((short) 2).setCellValue(all);
		// 第六步，将文件存到指定位置
		try {
			FileOutputStream fout = new FileOutputStream(getPath());
			wb.write(fout);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void exportPay(ArrayList<PayVO> list) {
		HSSFWorkbook wb = new HSSFWorkbook();
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		HSSFSheet sheet = wb.createSheet("付款单");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		HSSFRow row = sheet.createRow((int) 0);
		// 第四步，创建单元格，并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("付款日期");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("付款账号");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("付款人");
		cell.setCellStyle(style);
		cell = row.createCell((short) 3);
		cell.setCellValue("付款金额");
		cell.setCellStyle(style);
		cell = row.createCell((short) 4);
		cell.setCellValue("条目");
		cell.setCellStyle(style);
		cell = row.createCell((short) 5);
		cell.setCellValue("备注");
		cell.setCellStyle(style);

		// 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		// List list = CreateSimpleExcelToDisk.getStudent();

		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow(i + 1);
			PayVO vo = list.get(i);
			// 第四步，创建单元格，并设置值
			row.createCell((short) 0).setCellValue(vo.getDate());
			row.createCell((short) 1).setCellValue(vo.getPayAccount());
			row.createCell((short) 2).setCellValue(vo.getPayer());
			row.createCell((short) 3).setCellValue(vo.getCost());
			row.createCell((short) 4).setCellValue(vo.getEntry());
			row.createCell((short) 5).setCellValue(vo.getComments());
		}
		// 第六步，将文件存到指定位置
		try {
			FileOutputStream fout = new FileOutputStream(getPath());
			wb.write(fout);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void exportReceipt(ArrayList<ReceiptVO> list) {
		HSSFWorkbook wb = new HSSFWorkbook();
		// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
		HSSFSheet sheet = wb.createSheet("收款单");
		// 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
		HSSFRow row = sheet.createRow((int) 0);
		// 第四步，创建单元格，并设置值表头 设置表头居中
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

		HSSFCell cell = row.createCell((short) 0);
		cell.setCellValue("收款日期");
		cell.setCellStyle(style);
		cell = row.createCell((short) 1);
		cell.setCellValue("收款单位");
		cell.setCellStyle(style);
		cell = row.createCell((short) 2);
		cell.setCellValue("收款快递员");
		cell.setCellStyle(style);
		cell = row.createCell((short) 3);
		cell.setCellValue("收款金额");
		cell.setCellStyle(style);

		// 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		// List list = CreateSimpleExcelToDisk.getStudent();

		for (int i = 0; i < list.size(); i++) {
			row = sheet.createRow(i + 1);
			ReceiptVO vo = list.get(i);
			// 第四步，创建单元格，并设置值
			row.createCell((short) 0).setCellValue(vo.getDate());
			row.createCell((short) 1).setCellValue(vo.getSellingArea());
			row.createCell((short) 2).setCellValue(vo.getNumber());
			row.createCell((short) 3).setCellValue(vo.getMoney());
		}
		// 第六步，将文件存到指定位置
		try {
			FileOutputStream fout = new FileOutputStream(getPath());
			wb.write(fout);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getPath() {
		JFileChooser jf = new JFileChooser();
		jf.setFileSelectionMode(JFileChooser.SAVE_DIALOG | JFileChooser.DIRECTORIES_ONLY);
		jf.showDialog(null, null);

		File fi = jf.getSelectedFile();
		String f = fi.getAbsolutePath() + ".xls";
		System.out.println("save: " + f);
		return f;
	}
}
