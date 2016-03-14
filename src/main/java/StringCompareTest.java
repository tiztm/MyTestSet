/**
 * Created by nilszhang on 2016/3/3.
 */
public class StringCompareTest {

    //static String s ="select count(paymentRecord.id) FROM PaymentRecord paymentRecord INNER JOIN SupplyForecast supplyForecast ON supplyForecast.id= paymentRecord.supplyForecastId INNER JOIN CargoMember cargoMember ON cargoMember.id = supplyForecast.cargoMemberId INNER JOIN Member member1 ON member1.id = cargoMember.memberId INNER JOIN CarriageContract carriageContract ON paymentRecord.carriageContractId = carriageContract.id left JOIN receipt receipt ON receipt.carriageContractId = carriageContract.id INNER JOIN Member member2 ON member2.id = carriageContract.memberId INNER JOIN CODE code2 ON code2.codeValue = supplyForecast.transportUnit LEFT JOIN CargoMember agentCargoMember ON supplyForecast.agentMemberId = agentCargoMember.id LEFT JOIN Member agentMember ON agentMember.id = agentCargoMember.memberId WHERE code2.codeType = 'transportUnit' and paymentRecord.paymentStatus =? ";
    static String s ="SELECT count(v.id) FROM vehicleMember v,member m , memberUnit u,member tm WHERE v.memberId=m.id AND tm.id=u.memberId AND u.id = v.memberUnitId \n";


    public static void main(String[] args) throws Exception {
        System.out.println(s.replaceAll("\\s*", "").toLowerCase());
    }
}
