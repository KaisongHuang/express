package logic.warehousebl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import _enum.ResultMessage;
import data.datafactory.DataFactory;
import data.warehousedata.WarehouseData;
import logic.warehouseblservice.WarehouseBlService;
import po.CentreArrivalPO;
import po.CentreTransforPO;
import po.InStoragePO;
import po.OutStoragePO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.InStorageVO;
import vo.OutStorageVO;
import vo.SenderVO;

public class Warehouse implements WarehouseBlService {
	WarehouseData wd ;
	private int inNum;
	private int outNum;
	private int total;

	public Warehouse(){
		wd=DataFactory.getWarehosueDataService();
	}
	public int getInNum() {
		return inNum;
	}

	public int getOutNum() {
		return outNum;
	}

	public int getTotal() {
		return total;
	}

	public ResultMessage importGoods(InStorageVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		InStoragePO po = new InStoragePO(vo.getId(), vo.getIndate(), vo.getDestination(), vo.getWarehouseID(),
				vo.getPos_qu(), vo.getPos_pai(), vo.getPos_jia(), vo.getPos_wei(), vo.getIsCheck(), 0);
		System.out.println( vo.getPos_pai());
		System.out.println( vo.getPos_jia());
		System.out.println( vo.getPos_wei());
		try {

			rm = wd.insert(po);
			System.out.println("done");
		} catch (RemoteException e) {
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

	public ResultMessage exportGoods(OutStorageVO vo) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		OutStoragePO po = new OutStoragePO(vo.getId(), vo.getDestination(), vo.getOutdate(), vo.getWarehouseID(),
				vo.getTransportation(), vo.getTrans_id(), vo.getIsCheck());
		try {
			rm = wd.insert(po);
		} catch (RemoteException e) {
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

	public ResultMessage initWarehouse(InStorageVO vo) {
		// TODO Auto-generated method stub
		/*********** needs to be modified when adding listener *********/
		ResultMessage rm = null;
		InStoragePO po = new InStoragePO(vo.getId(), vo.getIndate(), vo.getDestination(), vo.getWarehouseID(),
				vo.getPos_qu(), vo.getPos_pai(), vo.getPos_jia(), vo.getPos_wei(), vo.getIsCheck(), 0);
		try {
			rm = wd.insert(po);
		} catch (RemoteException e) {
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

	public ResultMessage setAlarm(double rate) {
		try {
			return wd.setAlarm(rate);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResultMessage.FunctionError;
	}

	public ResultMessage checkAlarm() {

		try {
			return wd.checkAlarm();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return ResultMessage.FunctionError;
	}

	public ArrayList<Object> checkWarehouse(String begin, String end) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = new ArrayList<Object>();
		ArrayList<InStoragePO> list = new ArrayList<InStoragePO>();
		ArrayList<OutStoragePO> list1 = new ArrayList<OutStoragePO>();

		try {
			list = wd.findIn(begin, end);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			list1 = wd.findOut(begin, end);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 计算该时间区间内的库存数量
		inNum = list.size();
		outNum = list1.size();
		total = inNum - outNum;

		for (int i = 0; i < list.size(); i++)
			arr.add(new InStorageVO(list.get(i).getId(), list.get(i).getIndate(), list.get(i).getDestination(),
					list.get(i).getWarehouseID(), list.get(i).getPos_qu(), list.get(i).getPos_pai(),
					list.get(i).getPos_jia(), list.get(i).getPos_wei(), list.get(i).getIsCheck()));

		for (int i = 0; i < list1.size(); i++)
			arr.add(new OutStorageVO(list1.get(i).getId(), list1.get(i).getDestination(), list1.get(i).getOutdate(),
					list1.get(i).getWarehouseID(), list1.get(i).getTransportation(), list1.get(i).getTrans_id(),
					list1.get(i).getIsCheck()));
		System.out.println(inNum);

		return arr;
	}

	public ArrayList<InStorageVO> summarizeWarehouse() {
		Calendar time = Calendar.getInstance();
		int year = time.get(Calendar.YEAR);
		int month = time.get(Calendar.MONTH) + 1;
		int day = time.get(Calendar.DATE);

		String date = "";
		if (month >= 1 && month <= 9)
			date = "" + year + "0" + month + day;
		else
			date = "" + year + month + day;

		System.out.println("summarizeWarehouse()" + date);
		ArrayList<InStoragePO> list = new ArrayList<InStoragePO>();
		ArrayList<InStorageVO> vo = new ArrayList<InStorageVO>();
		try {
			list = wd.summarize(date);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < list.size(); i++) {
			vo.add(new InStorageVO(list.get(i).getId(), list.get(i).getIndate(), list.get(i).getDestination(),
					list.get(i).getWarehouseID(), list.get(i).getPos_qu(), list.get(i).getPos_pai(),
					list.get(i).getPos_jia(), list.get(i).getPos_wei(), list.get(i).getIsCheck()));
		}
		return vo;
	}

	public ArrayList<Object> showAdjustGoods() {
		ArrayList<Object> ob = new ArrayList<Object>();
		ArrayList<InStoragePO> list = new ArrayList<InStoragePO>();
		ArrayList<int[]> post = new ArrayList<int[]>();
		try {
			list = wd.adjust();
			System.out.println(list.size());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
		try {
			post = wd.findFreeSpace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < list.size(); i++) {
			ob.add(new InStorageVO(list.get(i).getId(), list.get(i).getIndate(), list.get(i).getDestination(),
					list.get(i).getWarehouseID(), list.get(i).getPos_qu(), list.get(i).getPos_pai(),
					list.get(i).getPos_jia(), list.get(i).getPos_wei(), list.get(i).getIsCheck()));
			ob.add(post.get(i));
		}

		return ob;
	}

	public ResultMessage clearWarehouse() {
		// TODO Auto-generated method stub
		try {
			return wd.clear();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResultMessage.FunctionError;
	}

	public ArrayList<CentreArrivalVO> getImport() {
		// TODO Auto-generated method stub
		ArrayList<CentreArrivalVO> vo = new ArrayList<CentreArrivalVO>();
		ArrayList<CentreArrivalPO> po = new ArrayList<CentreArrivalPO>();
		try {
			po = wd.getArrival();
			System.out.println(po.size());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < po.size(); i++) {
			vo.add(new CentreArrivalVO(po.get(i).getID(), po.get(i).getGetDate(), po.get(i).getTransferID(),
					po.get(i).getStart(), po.get(i).getExpressState(), po.get(i).getIsCheck()));
		}
		return vo;
	}

	public ArrayList<CentreTransforVO> getExport() {
		// TODO Auto-generated method stub
		ArrayList<CentreTransforVO> vo = new ArrayList<CentreTransforVO>();
		ArrayList<CentreTransforPO> po = new ArrayList<CentreTransforPO>();
		try {
			po = wd.getTransfor();
			System.out.println("po size="+po.size());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(po.size());
		for (int i = 0; i < po.size(); i++) {
			vo.add(new CentreTransforVO(po.get(i).getTransferStyle(), po.get(i).getDataOfGetin(),
					po.get(i).getCentreTransferID(), po.get(i).getBanHao(), po.get(i).getStart(),
					po.get(i).getArrival(), po.get(i).getHuoGuiHao(), po.get(i).getJianZhuangYuan(),
					po.get(i).getList(), po.get(i).getFee(), po.get(i).getIsCheck()));
		}

		return vo;
	}

	public String getSenderDestination(String id) {
		// TODO Auto-generated method stub
		String destination = null;
		try {
			destination = wd.getDestination(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destination;
	}

	public ResultMessage update(Object ob) {
		// TODO Auto-generated method stub
		ResultMessage rm = null;
		InStorageVO vo = (InStorageVO) ob;
		InStoragePO po = new InStoragePO(vo.getId(), vo.getIndate(), vo.getDestination(), vo.getWarehouseID(),
				vo.getPos_qu(), vo.getPos_pai(), vo.getPos_jia(), vo.getPos_wei(), vo.getIsCheck(), 0);
		System.out.println( vo.getPos_pai());
		System.out.println( vo.getPos_jia());
		System.out.println( vo.getPos_wei());
		try {

			rm = wd.update(po);
			System.out.println("done");
		} catch (RemoteException e) {
			e.printStackTrace();
			rm = ResultMessage.FunctionError;
		}
		return rm;
	}

}
