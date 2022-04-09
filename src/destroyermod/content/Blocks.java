package destroyermod.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.units.UnitFactory;

import static mindustry.type.ItemStack.with;


public class Blocks implements ContentList {
    public static Block groundBreaker, skyStriker, destroyerFactory;


    @Override
    public void load() {

        groundBreaker = new ItemTurret("groundbreaker"){{
            localizedName = "[gold]GroundBreaker";
            requirements(Category.turret, with(Items.titanium, 500, Items.thorium, 350, Items.blastCompound, 450));
            ammo(Items.blastCompound, Bullets.bigBasicBullet);

            recoilAmount = 5f;
            ammoPerShot = 1;
            maxAmmo = 35;
            rotateSpeed = 250;
            acceptCoolant = false;
            targetAir = false;
            size = 4;
            range = 400;
            minRange = 15;
            health = 600;
            reloadTime = 60f;
            ammoUseEffect = Fx.casing3;
            description = "A turret that shoots giant bullets and causes mini earthquakes to stop enemys.";

        }};


        skyStriker = new ItemTurret("skystriker"){{
            localizedName = "[gold]SkyStriker";
            requirements(Category.turret, with(Items.titanium, 500, Items.thorium, 300, Items.lead, 800));
            ammo(Items.titanium, Bullets.smallBasicBullet);

            recoilAmount = 3f;
            ammoPerShot = 2;
            maxAmmo = 80;
            rotateSpeed = 360;
            acceptCoolant = false;
            targetAir = true;
            targetGround = false;
            size = 4;
            range = 400;
            minRange = 10;
            health = 550;
            reloadTime = 20f;
            ammoUseEffect = Fx.casing1;
            description = "A basic but strong anti-air turret, made to destroy any pesky air units.";

        }};

        destroyerFactory = new UnitFactory("destroyer-factory"){{
            localizedName = "[orange]Destroyer Factory";
            requirements(Category.units, with(Items.titanium, 350, Items.silicon, 250, Items.lead, 500));
            size = 3;
            health = 300;
            consumes.power(5);
            itemCapacity = (int) 50f;
            description = "Produces tier 1 units from this mod.";
        }};


    }

}