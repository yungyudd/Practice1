package excep;

public class NetworkServiceV3_2 {

    public void sendMessage(String data){
       String address = "http://example.com";
       NetworkClientV3 client = new NetworkClientV3(address);
       client.initError(data);

       try {
           client.connect();
           client.send(data);
       }catch (ConnectExceptionV3 e){
           System.out.println("[연결 오류] 주소: "+e.getAddress()+", message: "+e.getMessage());
       }catch (NetworkClientExceptionV3 e){
           System.out.println("[네트워크 오류] 메세지: "+e.getMessage());
       }catch (Exception e){
           System.out.println("[알수 없는 오류] 메세지: "+e.getMessage());
       }finally {
           client.disconnect();
       }

    }
}
