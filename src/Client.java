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

interface IUser {
    String getName();
    IUser setName(String name);

    String getSurname();
    IUser setSurname(String surname);

    String getMail();
    IUser setMail(String mail);

    List<String> getMessagesLogsForCompany(ICompany company);

    IUser joinCompany(ICompany company);

    ClientType getType();
}

interface IAnonymousUser extends IUser {

}

interface IOrdinaryUser extends IUser {
    void setRating(int rating, ICompany company);
}

interface IManager extends IUser {
    boolean isActive();
}

interface IAdmin extends IUser {

}

interface ICreator extends IAdmin {

}