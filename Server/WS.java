package Server;


import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WS{



    public static void main(String[] args){
        //定义自己的webservice服务器发布的地址
        String address = "http://localhost:9696/APP";
        //这个9090端口随便定义，只要不冲突即可		//通过该方法进行发布
        Endpoint.publish(address, new APP());		//打印一句话，表示一下服务器进行了开启
        System.out.println("my webservcie starting");	}

}
