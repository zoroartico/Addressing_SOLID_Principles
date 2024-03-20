package solved.ISP.rpgClasses;

import solved.ISP.systems.IAttack;
import solved.ISP.systems.IDefend;
import solved.ISP.systems.IPotionUser;
import solved.ISP.systems.IManaUser;
import solved.ISP.systems.IStaminaUser;

public interface ISpellSword extends IAttack, IDefend, IPotionUser, IManaUser, IStaminaUser {
}
