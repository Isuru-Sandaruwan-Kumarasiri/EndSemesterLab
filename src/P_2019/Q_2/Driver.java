package P_2019.Q_2;

public class Driver {

    public static void main(String[] args) {
        String [] addresses={"100.0.0.1","130.5.44.77","10.50.40.13","192.168.1.1","100.130.12.1",
                "129.60.35.10","191.110.20.3","10.10.10.10","200.125.12.3","220.0.10.12"};

        IPTree tree=new IPTree();

        for(String s:addresses){
            tree.selectTree(findClass(s),s);
        }

        tree.preOrder();
    }

    public static String findClass(String address){

        int firstOctet=Integer.parseInt(address.split("\\.")[0]);
        String ipClass="";
       if(firstOctet<=126){
           ipClass="A";
       }else if(firstOctet<=191){
           ipClass="B";
       } else if (firstOctet<=223) {
           ipClass="C";
       }
       return ipClass;
    }
}
