package javalanguageplayground.beans;

public class Country {

	private final Integer id;
	private final String name;
	private final String capitalCity;
	private final Long population;

	public Country(final Integer id, final String name, final String capitalCity, final Long population) {
		this.id = id;
		this.name = name;
		this.capitalCity = capitalCity;
		this.population = population;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public Long getPopulation() {
		return population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Country other = (Country) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", capitalCity=");
		builder.append(capitalCity);
		builder.append(", population=");
		builder.append(String.format("%,d", population));
		builder.append("]");
		return builder.toString();
	}

}
