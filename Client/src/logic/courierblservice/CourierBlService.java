package logic.courierblservice;

import _enum.ResultMessage;
import po.DistanceAndFee;
import vo.CourierVO;
import vo.SenderVO;

public interface CourierBlService {
      public ResultMessage OrderInput(SenderVO vo,DistanceAndFee daf);
      public double getPrice(String type,String city1,String city2,double packing);
      public double getTime(String start,String end);
      public ResultMessage ConsigneeinfoInput(CourierVO vo);
      public double getTime();
      public double getMoney();
}
