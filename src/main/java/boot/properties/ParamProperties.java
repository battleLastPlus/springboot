package boot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParamProperties {
	@Value("${bases.name}")
	private String basesName;

	public String getBasesName() {
		return basesName;
	}

	public void setBasesName(String basesName) {
		this.basesName = basesName;
	}

}
