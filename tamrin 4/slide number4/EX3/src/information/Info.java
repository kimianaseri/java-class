package information;

public class Info <NAME,ID,FATHERNAME>{
    private NAME name;
    private ID id;
    private FATHERNAME fathername;

    public NAME getName()
    {
        return name;
    }
    public void setName(NAME name)
    {
        this.name=name;
    }

    public ID getId()
    {
        return id;
    }
    public void setId(ID id)
    {
        this.id=id;
    }

    public FATHERNAME getFathername()
    {
        return fathername;
    }
    public void setFathername(FATHERNAME fathername)
    {
        this.fathername=fathername;
    }
}
