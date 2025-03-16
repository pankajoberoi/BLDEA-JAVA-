public class Demo21 {
    public static void main(String[] args) {
        try {
            boolean padaikaroge=false;
            if(padaikaroge==false){
                throw new MoodNotFoundException("Garmi lag rhi hai");
            }
        } catch (Exception e) {
            System.out.println("mai fir bhi padaunga "+ e);
        }finally{
            System.out.println("Teacher to apka class mai aega");
        }

        System.out.println("Tabhi ammerr banogee good");
    }
}
