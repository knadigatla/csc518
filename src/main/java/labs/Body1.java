class Body {
    public long idNum;
    public String name = "<unnamed>";
    public Body orbits = null;
    private static long nextID = 0;
    {
	idNum = nextID++;
    }
    
    protected void walk( int distance)
    {}
    
    public Body(String name, Body orbitsAround) {
	this.name = name;
	orbits = orbitsAround;
    }
    
    public String toString()
    {

	String desc = idNum + " (" + name + ")";

	if (orbits != null)
	    desc += " orbits " + orbits.toString();

	return desc;

    }
}
