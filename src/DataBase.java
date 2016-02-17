/**
 * Created by Nikita on 16.02.2016.
 */

interface IDataBase {
    boolean createClient(IClient client, ClientType type, String login, String password);
    boolean createCompany(ICompany company, IAdmin admin);

    /*
    *Поля для заполнения клиенту

    protected String Name;
    protected String Surname;
    protected Company company;

    public Client JoinToCompany(Company company)

    */

    IClient GetRegisteredClient(String login, String password);
/*    поля Company(что заполняет админ при регистрации)

    String Name;
    IconView Icon;
    WorkFields WorkAction;
    String Describe;
    List<String> Links;
    List<Integer> Shares;
    int Rate;

    List<IManager> Workers;
    ClientType MessageSecurityLevel;
    List<String> Reviews;
    List<Pair<String,IClient>> StatusDescribe_Partner_Pairs;
*/

}
