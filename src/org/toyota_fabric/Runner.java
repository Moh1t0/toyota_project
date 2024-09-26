package org.toyota_fabric;

import org.toyota_fabric.car_components.*;
import org.toyota_fabric.cars.Car;
import org.toyota_fabric.cars.light_cars.Camry;
import org.toyota_fabric.cars.trucks.Dyna;
import org.toyota_fabric.cars.trucks.Hiance;
import org.toyota_fabric.cars.сabriolet.Solara;
import org.toyota_fabric.enums.CarType;
import org.toyota_fabric.enums.Country;
import org.toyota_fabric.enums.GearBoxType;
import org.toyota_fabric.enums.WheelsDiameter;
import org.toyota_fabric.exeptions.CountyFactoryNotEqualException;
import org.toyota_fabric.exeptions.StartCarException;
import org.toyota_fabric.factory.Conveyor;
import org.toyota_fabric.factory.Factory;
import org.toyota_fabric.people.Buyer;
import org.toyota_fabric.people.Cashier;
import org.toyota_fabric.people.Manager;
import org.toyota_fabric.warehouse.Warehouse;

import java.math.BigDecimal;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws StartCarException, CountyFactoryNotEqualException {

        //Компоненты для Camry
        Electrics camryElectrics = new Electrics(true);
        Engine camryEngine = new Engine(true);
        Headlights camryHeadlights = new Headlights(false);
        CruiseControl camryCruiseControl = new CruiseControl();
        Usb camryUsb = new Usb();

        //Компоненты для Solara
        Electrics solaraElectrics = new Electrics(true);
        Engine solaraEngine = new Engine(true);
        Headlights solaraHeadlights = new Headlights(true);
        CruiseControl solaraCruiseControl = new CruiseControl();
        Roof soloraRoof = new Roof();
        Refrigerator solaraRefrigerator = new Refrigerator();

        //Компоненты для Dyna
        Electrics dynaElectrics = new Electrics(true);
        Engine dynaEngine = new Engine(true);
        Headlights dynaHeadlights = new Headlights(true);
        LiftingPower dynaLiftingPower = new LiftingPower(2000);
        Socket dynaSocket = new Socket();

        //Компоненты для Hiance
        Electrics hianceElectrics = new Electrics(true);
        Engine hianceEngine = new Engine(true);
        Headlights hianceHeadlights = new Headlights(true);
        LiftingPower hianceLiftingPower = new LiftingPower(1000);
        SpareWheel hianceSpareWheel = new SpareWheel(true);

//        Camry camry = new Camry("Черный", 200, false, camryElectrics, camryEngine,
//                camryHeadlights, GearBoxType.AUTOMATIC,
//                new Wheel(false, WheelsDiameter.DIAMETER_16),
//                new Wheel(false, WheelsDiameter.DIAMETER_16),
//                new Wheel(false, WheelsDiameter.DIAMETER_16),
//                new Wheel(false, WheelsDiameter.DIAMETER_16),
//                new BigDecimal(200.000), new GasTank(200), Country.KAZAKHSTAN,
//                camryCruiseControl,
//                camryUsb);
//
//        Solara solara = new Solara("Белый", 170, false,
//                solaraElectrics, solaraEngine, solaraHeadlights, GearBoxType.ROBOT,
//                new Wheel(false, WheelsDiameter.DIAMETER_16),
//                new Wheel(false, WheelsDiameter.DIAMETER_16),
//                new Wheel(false, WheelsDiameter.DIAMETER_16),
//                new Wheel(false, WheelsDiameter.DIAMETER_16),
//                new BigDecimal(150.000), new GasTank(150), Country.CHINA, solaraCruiseControl, soloraRoof,
//                solaraRefrigerator);
//
//        Dyna dyna = new Dyna("Серый", 120, false, dynaElectrics,
//                dynaEngine, dynaHeadlights, GearBoxType.MECHANICS,
//                new Wheel(false, WheelsDiameter.DIAMETER_20),
//                new Wheel(false, WheelsDiameter.DIAMETER_20),
//                new Wheel(false, WheelsDiameter.DIAMETER_20),
//                new Wheel(false, WheelsDiameter.DIAMETER_20), new BigDecimal(400.000),
//                new GasTank(300), Country.JAPAN, dynaLiftingPower,
//                dynaSocket);
//
//        Hiance hiance = new Hiance("Серый", 100, false, hianceElectrics,
//                hianceEngine, hianceHeadlights, GearBoxType.MECHANICS,
//                new Wheel(false, WheelsDiameter.DIAMETER_17),
//                new Wheel(false, WheelsDiameter.DIAMETER_17),
//                new Wheel(false, WheelsDiameter.DIAMETER_17),
//                new Wheel(false, WheelsDiameter.DIAMETER_17),
//                new BigDecimal(350.000), new GasTank(200), Country.RUSSIA, hianceLiftingPower, hianceSpareWheel);
//
//
//        camry.startMove();
//        camry.turningOnHeadlights();
//        camryCruiseControl.on();
//        camryCruiseControl.off();
//        camryUsb.musicOn();
//        camryUsb.musicOff();
//
//        System.out.println("____________________________________");
//
//        solara.startMove();
//        solaraCruiseControl.on();
//        solaraRefrigerator.coolDrink();
//        soloraRoof.lower();
//
//        System.out.println("____________________________________");
//
//        dyna.startMove();
//        dynaSocket.charge();
//        dynaSocket.disable();
//        System.out.println(dynaLiftingPower);
//
//        System.out.println("____________________________________");
//
//        hiance.startMove();
//        hiance.finishMove();
//        System.out.println(hianceSpareWheel);
//        System.out.println(hianceLiftingPower);
//
//        System.out.println("____________________________________");

        /**
         * 2 этап:
         */

        Factory usaFactory = new Factory(Country.USA);
        Conveyor usaConveyor = new Conveyor(Country.USA, usaFactory);
        Camry usaCamry = usaConveyor.createCamry("Белая", new BigDecimal("200.000"));
        usaCamry.setGasTank(new GasTank(200));
        usaCamry.startMove();
        usaCamry.turningOnHeadlights();
        System.out.println(usaCamry.getUsb());
        usaCamry.getUsb().musicOn();

        System.out.println("_________________________________");

        Factory kazakhFactory = new Factory(Country.KAZAKHSTAN);
        Conveyor kazakhConveyor = new Conveyor(Country.KAZAKHSTAN, kazakhFactory);
        Dyna kazakhDyna = kazakhConveyor.createDyna("Черная", new BigDecimal("500.000"));
        kazakhDyna.getSocket().charge();
        kazakhDyna.setGasTank(new GasTank(20));
        kazakhDyna.startMove();
        Camry kazakhCamry = kazakhConveyor.createCamry("Черная", new BigDecimal("150.000"));

        System.out.println("_________________________________");
        Factory chinaFactory = new Factory(Country.CHINA);
        Conveyor chinaConveyor = new Conveyor(Country.CHINA, chinaFactory);
        Hiance chinaHiance = chinaConveyor.createHiance("Синяя", new BigDecimal("800.000"));
        System.out.println(chinaHiance.getSpareWheel());

        System.out.println("____________________________________");
        Factory russiaFactory = new Factory(Country.RUSSIA);
        Conveyor russiaConveyor = new Conveyor(Country.RUSSIA, russiaFactory);
        Solara russiaSolara = russiaConveyor.createSolara(new BigDecimal("500.000"), "Зеленая");
        russiaSolara.getRoof().raised();
        System.out.println(russiaSolara.getCountry());

        System.out.println("_______________________________________");

        /**
         *  3 этап:
         */

        Warehouse warehouse = new Warehouse();
        warehouse.addToWarehouse(usaCamry);
        warehouse.addToWarehouse(kazakhDyna);
        warehouse.addToWarehouse(kazakhCamry);
        System.out.println(warehouse.getCountCar());
        warehouse.takeCarFromWarehouse(usaCamry);
        System.out.println(warehouse.getCountCar());
        warehouse.carsCount(CarType.CAMRY);
        System.out.println("\n__________________________________");

        /**
         *  4 этап:
         */

        Factory japanFactory = new Factory(Country.JAPAN);
        Conveyor japanConveyor = new Conveyor(Country.JAPAN, japanFactory);
        Camry japanCamry = japanConveyor.createCamry("Black", new BigDecimal("10000.00"));
        Solara japanSolara = japanConveyor.createSolara(new BigDecimal("12000.00"), "white");
        Hiance japanHiance = japanConveyor.createHiance("black", new BigDecimal("15000.00"));
        Dyna japanDyna = japanConveyor.createDyna("black", new BigDecimal("22000.00"));

        warehouse.addToWarehouse(japanCamry);
        warehouse.addToWarehouse(japanSolara);
        warehouse.addToWarehouse(japanHiance);
        warehouse.addToWarehouse(japanDyna);

        Manager manager1 = new Manager("Василий", japanConveyor, warehouse);
        Cashier cashier1 = new Cashier("Артем");
        Buyer buyer1 = new Buyer("Иван", new BigDecimal("10000.00"));
        Car sellCar1 = manager1.sellCar(buyer1, warehouse);
        cashier1.addIncome(sellCar1);

        Buyer buyer2 = new Buyer("Петр", new BigDecimal("12000.00"));
        Car sellCar2 = manager1.sellCar(buyer2, warehouse);
        cashier1.addIncome(sellCar2);

        Buyer buyer3 = new Buyer("Юрий", new BigDecimal("15000.00"));
        Car sellCar3 = manager1.sellCar(buyer3, warehouse);
        cashier1.addIncome(sellCar3);

        Buyer buyer4 = new Buyer("Фёдор", new BigDecimal("22000.00"));
        Car sellCar4 = manager1.sellCar(buyer4, warehouse);
        cashier1.addIncome(sellCar4);

        Buyer buyer5 = new Buyer("Константин", new BigDecimal("11000.00"));
        Car sellCar5 = manager1.sellCar(buyer5, warehouse);
        cashier1.addIncome(sellCar5);

        Buyer buyer6 = new Buyer("Александр", new BigDecimal("13200.00"));
        Car sellCar6 = manager1.sellCar(buyer6, warehouse);
        cashier1.addIncome(sellCar6);

        Buyer buyer7 = new Buyer("Алексей", new BigDecimal("8000.00"));
        Car sellCar7 = manager1.sellCar(buyer7, warehouse);
        cashier1.addIncome(sellCar7);

        Buyer buyer8 = new Buyer("Дмитрий", new BigDecimal("30000.00"));
        Car sellCar8 = manager1.sellCar(buyer8, warehouse);
        cashier1.addIncome(sellCar8);
        System.out.println(cashier1.getIncome());


    }
}
