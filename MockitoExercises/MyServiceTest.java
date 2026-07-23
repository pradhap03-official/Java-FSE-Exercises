import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    void testFetchData() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mockito Success");

        MyService service = new MyService(api);

        assertEquals("Mockito Success", service.fetchData());

    }

}
