package logic.courierblservice;

import _enum.ResultMessage;
import po.DistanceAndFee;
import vo.CourierVO;
import vo.SenderVO;

public interface CourierBlService {
      public ResultMessage OrderInput(SenderVO vo,DistanceAndFee daf);
      public double getPrice(double fee,double packing);
      public String getTime(double distance);
      public ResultMessage ConsigneeinfoInput(CourierVO vo);
}
