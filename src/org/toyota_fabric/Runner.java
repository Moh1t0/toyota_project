package org.toyota_fabric;

import org.toyota_fabric.car_components.Electrics;
import org.toyota_fabric.car_components.Engine;
import org.toyota_fabric.car_components.Headlights;
import org.toyota_fabric.car_components.Wheels;
import org.toyota_fabric.cars.light_cars.Camry;
import org.toyota_fabric.cars.trucks.Dyna;
import org.toyota_fabric.cars.trucks.Hiance;
import org.toyota_fabric.cars.сabriolet.Solara;
import org.toyota_fabric.enums.GearBoxType;
import org.toyota_fabric.enums.WheelsDiameter;
import org.toyota_fabric.exeptions.StartCarException;

public class Runner {
    public static void main(String[] args) throws StartCarException {

        //Компоненты для Camry
        Electrics camryElectrics = new Electrics(true);
        Engine camryEngine = new Engine(true);
        Headlights camryHeadlights = new Headlights(false);

        //Компоненты для Solara
        Electrics solaraElectrics = new Electrics(true);
        Engine solaraEngine = new Engine(true);
        Headlights solaraHeadlights = new Headlights(true);

        //Компоненты для Dyna
        Electrics dynaElectrics = new Electrics(true);
        Engine dynaEngine = new Engine(true);
        Headlights dynaHeadlights = new Headlights(true);

        //Компоненты для Hiance
        Electrics hianceElectrics = new Electrics(true);
        Engine hianceEngine = new Engine(true);
        Headlights hianceHeadlights = new Headlights(true);

        Camry camry = new Camry("Черный", 200, false, 50, camryElectrics, camryEngine,
               camryHeadlights , GearBoxType.AUTOMATIC,
                new Wheels(false, WheelsDiameter.CAMRY),
                new Wheels(false, WheelsDiameter.CAMRY),
                new Wheels(false, WheelsDiameter.CAMRY),
                new Wheels(false, WheelsDiameter.CAMRY), 20_000, true);

        Solara solara = new Solara("Белый", 170, false, 70,
                solaraElectrics, solaraEngine, solaraHeadlights, GearBoxType.ROBOT,
                new Wheels(false, WheelsDiameter.SOLARA),
                new Wheels(false, WheelsDiameter.SOLARA),
                new Wheels(false, WheelsDiameter.SOLARA),
                new Wheels(false, WheelsDiameter.SOLARA), 25_000, true, true);

        Dyna dyna = new Dyna("Серый", 120, false, 120, dynaElectrics,
                dynaEngine, dynaHeadlights, GearBoxType.MECHANICS,
                new Wheels(false, WheelsDiameter.DYNA),
                new Wheels(false, WheelsDiameter.DYNA),
                new Wheels(false, WheelsDiameter.DYNA),
                new Wheels(false, WheelsDiameter.DYNA), 40_000, 10_000);

        Hiance hiance = new Hiance("Серый", 100, false, 150, hianceElectrics,
                hianceEngine, hianceHeadlights, GearBoxType.MECHANICS,
                new Wheels(false, WheelsDiameter.HIANCE),
                new Wheels(false, WheelsDiameter.HIANCE),
                new Wheels(false, WheelsDiameter.HIANCE),
                new Wheels(false, WheelsDiameter.HIANCE), 40_000, 10_000, true);

        camry.usb();
        camry.startMove();
        camry.turningOnHeadlights();
        System.out.println("Есть круиз контроль? " + camry.isCruiseControl());
        System.out.println("____________________________________");

        solara.startMove();
        solara.coolDrink();
        System.out.println("Крыша опущена ? " + solara.isRoofDown());
        System.out.println("____________________________________");

        dyna.startMove();
        dyna.charge();
        System.out.println("Грузоподъемность: " + dyna.getLiftingPower());
        System.out.println("____________________________________");

        System.out.println("Есть ли запасное колесо ?  " + hiance.isHasSpareWheel());
        hiance.startMove();
        hiance.finishMove();
    }
}
