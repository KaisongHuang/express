package logic.courierblservice;

import _enum.ResultMessage;
import vo.CourierVO;
import vo.SenderVO;

public interface CourierBlService {
      public ResultMessage OrderInput(SenderVO vo);
      public double getPrice(double fee,double packing);
      public String getTime(int distance);
      public ResultMessage ConsigneeinfoInput(CourierVO vo);
}
