
public class AssassinGod extends SmiteGod {
	
	private String role;

	public AssassinGod(String name, String pantheon) {
		super(name, pantheon);		
	}
	
	public void assignRole(String assignedrole) {
		this.role = assignedrole;
	}

	@Override
	public String getDamageType() {		
		return "Physical";
	}

	@Override
	public String getRange() {
		return "Melee";
	}
	

}
