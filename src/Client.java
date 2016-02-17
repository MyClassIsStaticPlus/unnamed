import java.util.List;

/**
 * интерфейс для клиентов
 */
enum ClientType{
    CREATOR,
    GROUP_ADMIN,
    MANAGER,
    REGISTERED_USER,
    ANONYMOUS_USER
}

interface IClient {
    String getName();
    IClient setName(String name);

    String getSurname();
    IClient setSurname(String surname);

    String getMail();
    IClient setMail(String mail);

    List<String> getMessagesLogsForCompany(ICompany company);

    IClient joinCompany(ICompany company);

    ClientType getType();
}

interface IAnonymousClient extends IClient {

}

interface IOrdinaryClient extends IClient {
    void setRating(int rating, ICompany company);
}

interface IManager extends IClient {
    boolean isActive();
}

interface IAdmin extends IClient {

}

interface ICreator extends IAdmin {

}