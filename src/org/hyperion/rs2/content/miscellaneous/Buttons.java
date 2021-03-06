package org.hyperion.rs2.content.miscellaneous;

import org.hyperion.rs2.handler.LogicHandler;
import org.hyperion.rs2.handler.interfaces.ButtonHandler;
import org.hyperion.rs2.model.Animation;
import org.hyperion.rs2.model.Player;
import org.hyperion.rs2.net.ActionSender;

public class Buttons extends LogicHandler implements ButtonHandler {

	@Override
	public boolean handleButton(Player player, int buttonId) throws Throwable {
		switch(buttonId) {
			case 152:
				if(player.getWalkingQueue().isRunningToggled()) {
					player.getWalkingQueue().setRunningToggled(false);
				}
				break;
			case 153:
				if(!player.getWalkingQueue().isRunningToggled()) {
					player.getWalkingQueue().setRunningToggled(true);
				}
				break;
			case 161:
				player.playAnimation(Animation.CRY);
				break;
			case 162:
				player.playAnimation(Animation.THINKING);
				break;
			case 163:
				player.playAnimation(Animation.WAVE);
				break;
			case 164:
				player.playAnimation(Animation.BOW);
				break;
			case 165:
				player.playAnimation(Animation.ANGRY);
				break;
			case 166:
				player.playAnimation(Animation.DANCE);
				break;
			case 167:
				player.playAnimation(Animation.BECKON);
				break;
			case 168:
				player.playAnimation(Animation.YES_EMOTE);
				break;
			case 169:
				player.playAnimation(Animation.NO_EMOTE);
				break;
			case 170:
				player.playAnimation(Animation.LAUGH);
				break;
			case 171:
				player.playAnimation(Animation.CHEER);
				break;
			case 172:
				player.playAnimation(Animation.CLAP);
				break;
			case 13362:
				player.playAnimation(Animation.PANIC);
				break;
			case 13363:
				player.playAnimation(Animation.JIG);
				break;
			case 13364:
				player.playAnimation(Animation.SPIN);
				break;
			case 13365:
				player.playAnimation(Animation.HEADBANG);
				break;
			case 13366:
				player.playAnimation(Animation.JOYJUMP);
				break;
			case 13367:
				player.playAnimation(Animation.RASPBERRY);
				break;
			case 13368:
				player.playAnimation(Animation.YAWN);
				break;
			case 13383:
				player.playAnimation(Animation.GOBLIN_BOW);
				break;
			case 13384:
				player.playAnimation(Animation.GOBLIN_DANCE);
				break;
			case 13369:
				player.playAnimation(Animation.SALUTE);
				break;
			case 13370:
				player.playAnimation(Animation.SHRUG);
				break;
			case 11100:
				player.playAnimation(Animation.BLOW_KISS);
				break;
			case 667:
				player.playAnimation(Animation.GLASS_BOX);
				break;
			case 6503:
				player.playAnimation(Animation.CLIMB_ROPE);
				break;
			case 6506:
				player.playAnimation(Animation.LEAN);
				break;
			case 666:
				player.playAnimation(Animation.GLASS_WALL);
				break;
			case 2458:
				ActionSender.sendLogout(player);
				break;
			case 5387:
				player.getSettings().setWithdrawAsNotes(false);
				break;
			case 5386:
				player.getSettings().setWithdrawAsNotes(true);
				break;
			case 8130:
				player.getSettings().setSwapping(true);
				break;
			case 8131:
				player.getSettings().setSwapping(false);
				break;
			case 3651:
				ActionSender.sendCloseInterfaces(player);
				break;
		}
		System.out.println("Button Id: " + buttonId);
		return false;
	}

	@Override
	public Object getObject() {
		return this;
	}

}
