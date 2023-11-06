class Stand{
    private void read(){
        System.out.println("private");
    }
    public void read1(){
        this.read();
        System.out.println("public");
    }
    void defaul()
    {
      System.out.println("default");  
    }
    protected void write(){
        System.out.println("protected");
    }
}
public class Model
{
	public static void main(String[] args) {
		Stand s=new Stand();
		s.read1();
		s.defaul();
		s.write();
	}
}
