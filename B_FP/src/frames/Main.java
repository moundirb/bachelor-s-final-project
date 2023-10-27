package frames;

public class Main {
   private byte[] picture;
 
    public Main(byte[] Img) {
        this.picture = Img;
    }

    public byte[] getimg() {
        return picture;
    }
    public static void main(String args[]) {
       
        
        
        
        /* Create and display the login form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login login = new Login();
                login.setVisible(true);
                        } 
                    });
                }
            }
  
  
