public class Main {
    public static void main(String[] args) {
        try{
            Cliente cliente1 = new Cliente("Cliente 1", new int[]{2,2,1,5,2,3});
            Cliente cliente2 = new Cliente("Cliente 2", new int[]{1,3,5,1,1});
            Cliente cliente3 = new Cliente("Cliente 3", new int[]{5,3,7,8});

            long initialTime = System.currentTimeMillis();
            //System.out.println(initialTime);

            CajeraThread cajera1 = new CajeraThread("Cajera1", cliente1, initialTime);
            CajeraThread cajera2 = new CajeraThread("Cajera2", cliente2, initialTime);
            CajeraThread cajera3 = new CajeraThread("Cajera3", cliente3, initialTime);


            cajera1.start();
            cajera2.start();
            cajera3.start();


        } catch (Exception e){
            e.printStackTrace();
        }


    }
}