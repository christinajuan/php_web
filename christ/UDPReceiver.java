package tw.org.iii;

public class UDPReceiver {
    public static void main(String[] args){
        byte[] buf = new byte[1024];
        try{
            DatagramSocket socket = new DatagramSocket(8888);
            DatagramPacket packet = new DatagramPacket(buf,0, buf.length);
            socket.send(packet);
            socket.close();
            Log.v("brad", "UDP Receiver OK");
        }catch (Exception e){
            Log.v("brad", e.toString());
        }
    }
}
