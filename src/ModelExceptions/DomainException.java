package ModelExceptions;

public class DomainException extends RuntimeException {
    // aqui voce pode usar a runtimeexception ou exception
    // a diferença e que uma voce precisa tratar e a outra nao

    public DomainException(String msg) {
        super(msg);
    }

}