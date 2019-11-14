import java.io.*;
public class VerificacionInputStream extends ObjectInputStream {

    public VerificacionInputStream(InputStream in) throws IOException {
        super(in);
    }

    @Override
    protected Class resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException{
        if(!desc.getName().equals(User.class.getName())){
            throw new InvalidClassException(
                    "Intento de deserialización inválida!! :O",
                    desc.getName()
            );
        }
        return super.resolveClass(desc);
    }
}
