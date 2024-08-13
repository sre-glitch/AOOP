package fivec;

public interface Lending {
    void lendPublication(Publication publication, User user);
    void returnPublication(Publication publication, User user);
}
