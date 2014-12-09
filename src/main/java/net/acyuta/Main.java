package net.acyuta;

import net.acyuta.utils.C;
import net.acyuta.vk.Vk;
import net.acyuta.vk.VkLogic;

/**
 * Created by acyuta on 05.12.14.
 */
public class Main {

    public static void main(String[] args) {
        Vk vk = null;
        try {
            vk = Vk.init();
        } catch (Exception e) {
            C.die(e.getMessage());
        }
        assert vk != null;

        if (!vk.checkAccess())
            C.die(vk.usage());

        VkLogic logic = new VkLogic(vk);
        logic.dailyInfo();
    }
}
