package labs;

class ItCluster {

    private String cityName;
    private long numOfParticipants;
    private String directorName;
    private int participantAge;
    private String participantSex;
    private static int ParticipantID;
    protected String participantFirstName;
    protected String participantLastName;
    public static final int SIZE_OF_OBJECTS_ARRAY = 4;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getNumOfParticipants() {
        return numOfParticipants;
    }

    public void setNumOfParticipants(long numOfParticipants) {
        this.numOfParticipants = numOfParticipants;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getParticipantSex() {
        return participantSex;
    }

    public void setParticipantSex(String participantSex) {
        this.participantSex = participantSex;
    }

    public int getParticipantAge() {
        return participantAge;
    }

    public void setParticipantAge(int participantAge) {
        this.participantAge = participantAge;
    }

    public String getParticipantFirstName() {
        return participantFirstName;
    }

    public String setParticipantLastName() {
        return participantFirstName;
    }

    public void setParticipantFirstName(String participantFirstName) {
        this.participantFirstName = participantFirstName;
    }


    public ItCluster() {
        this( null, 0, null, null, 0,
                null, null, 0);
    }

    ;

    public ItCluster(String cityName, long numOfParticipants, String directorName, String participantSex) {
        this.cityName = cityName;
        this.numOfParticipants = numOfParticipants;
        this.directorName = directorName;
        this.participantSex = participantSex;
    }

    public ItCluster(String cityName, long numOfParticipants, String directorName, String participantSex, int participantAge, String participantFirstName, String participantLastName, int ParticipantID) {
        this.cityName = cityName;
        this.numOfParticipants = numOfParticipants;
        this.directorName = directorName;
        this.participantSex = participantSex;
        this.participantAge = participantAge;
        this.participantFirstName = participantFirstName;
        this.participantLastName = participantLastName;
        ItCluster.ParticipantID = ParticipantID;

    }

    @Override
    public String toString() {
        return "ItCluster{" +
                "cityName='" + cityName + '\'' +
                ", numOfParticipants=" + numOfParticipants +
                ", directorName='" + directorName + '\'' +
                ", participantSex='" + participantSex + '\'' +
                ", participantAge=" + participantAge +
                ", participantFirstName='" + participantFirstName + '\'' +
                ", participantLastName='" + participantLastName +
                '}';
    }


    public String printCityName() {
        return cityName;
    }

    public double printNumOfParticipants() {
        return numOfParticipants;
    }

    public String printDirectorName() {
        return directorName;
    }

    public String printParticipantSex() {
        return participantSex;
    }

    public int printParticipanntAge() {
        return participantAge;
    }

    public int PrintStaticParticipantID() {
        return ParticipantID;
    }

    public String printParticipantsFirstAge() {
        return participantFirstName;
    }

    public String printParticipantsLastAge() {
        return participantLastName;
    }

    public void resetValue(String cityName, long numOfParticipants, String directorName, String participantSex, int participantAge, String participantFirstName, String participantLastName, int ParticipantID) {
        this.cityName = cityName;
        this.numOfParticipants = numOfParticipants;
        this.directorName = directorName;
        this.participantSex = participantSex;
        this.participantAge = participantAge;
        this.participantFirstName = participantFirstName;
        this.participantLastName = participantLastName;
        this.ParticipantID = ParticipantID;
    }


}
