package solved.ISP.rpgClasses;

import solved.ISP.systems.IAttack;
import solved.ISP.systems.IDefend;
import solved.ISP.systems.IPotionUser;
import solved.ISP.systems.IStaminaUser;

public interface IWarrior extends IAttack, IDefend, IPotionUser, IStaminaUser {
}
