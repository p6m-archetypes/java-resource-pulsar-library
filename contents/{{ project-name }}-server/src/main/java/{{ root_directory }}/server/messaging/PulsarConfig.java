package {{ group_id }}.server.messaging;

import org.springframework.context.annotation.Configuration;
import org.springframework.pulsar.annotation.EnablePulsar;

@Configuration
@EnablePulsar
public class PulsarConfig {
}
