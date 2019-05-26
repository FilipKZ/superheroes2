public class TeamUtils {
    public static boolean compareTeams (Team one, Team two) {
        return one.getTeamPower() > two.getTeamPower();
    }

    public static boolean compareTeamWithBuff (Team one, Team two) {
        one.buffTeamPower();
        two.buffTeamPower();
        return one.getTeamPower() > two.getTeamPower();
    }
}
