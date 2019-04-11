
public abstract class SmiteGod implements DamageType{
	public String name;
	public String pantheon;
	
	
	public SmiteGod(String name, String pantheon) {
		super();
		this.name = name;
		this.pantheon = pantheon;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pantheon == null) ? 0 : pantheon.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmiteGod other = (SmiteGod) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pantheon == null) {
			if (other.pantheon != null)
				return false;
		} else if (!pantheon.equals(other.pantheon))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "SmiteGod [name=" + name + ", pantheon=" + pantheon + "]";
	}
	
	
}
