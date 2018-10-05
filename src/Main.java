public class Main {

    public static void main(String[] args) {
        //1) FloofyLoop

        //checking all FloofyLoop Constructors
        FloofyLoop fl1 = new FloofyLoop("fl1", 4);
        FloofyLoop fl2 = new FloofyLoop("fl2");
        FloofyLoop fl3 = new FloofyLoop(12);

        //checking calculatePrice and toString functions
        fl1.calculatePrice();
        System.out.println(fl1);

        fl2.calculatePrice(8);
        System.out.println(fl2);

        //checking HowFar and Style functions
        System.out.println(fl1.howFar() + " " + fl1.style());

        //2) CatBus
        CatBus cb1 = new CatBus("cb1", 4);
        System.out.println(cb1);

        CatBus cb2 = new CatBus("cb2", 4, 5);
        System.out.println(cb2);

        //everything else
        System.out.println(cb1.howFar() + " " + cb1.style() + " " + cb1.sayHi() + " " + cb1.sayBye());

        //3) SootBall
        SootBall sb1 = new SootBall("sb1", 4, 6);
        System.out.println(sb1.calculatePrice() + " " + sb1.style());

        //4) Critter
        Critter ct1 = new Critter("ct1", 45);
        System.out.println("The regular price is " + ct1.calculatePrice()+ " and the sale price is "+ ct1.calculateSalePrice());

        //5) Sonic
        Sonic sn1 = new Sonic("sn1", 25);
        Sonic sn2 = new Sonic();
        System.out.println(sn1.calculatePrice());
        System.out.println(sn1);
    }
}