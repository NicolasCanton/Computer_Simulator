public class OperatingSystem {
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private int osRamMemoryRequirement;
    private Software[] osSoftware;

    OperatingSystem(String osName ,String osVersion ,String osArchitecture ,boolean osOnlyCommand ,int osSpaceRequirement ,int osRamMemoryRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public boolean isOsOnlyCommand() {
        return osOnlyCommand;
    }

    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }

    public int getOsSpaceRequirement() {
        return osSpaceRequirement;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public int getOsRamMemoryRequirement() {
        return osRamMemoryRequirement;
    }

    public void setOsRamMemoryRequirement(int osRamMemoryRequirement) {
        this.osRamMemoryRequirement = osRamMemoryRequirement;
    }

    public Software[] getOsSoftware() {
        return osSoftware;
    }

    public void setOsSoftware(Software[] osSoftware) {
        this.osSoftware = osSoftware;
    }

    public void installSw(Software sw1) {

    }
}


