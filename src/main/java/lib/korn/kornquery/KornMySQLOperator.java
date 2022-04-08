package lib.korn.kornquery;

import lib.korn.kornutil.KornEnum;

public class KornMySQLOperator extends KornEnum {
	public KornMySQLOperator(String key) {
		super(key);
	}

	public static KornMySQLOperator AND() { return new KornMySQLOperator("AND"); }
	public static KornMySQLOperator OR() { return new KornMySQLOperator("OR"); }
}
