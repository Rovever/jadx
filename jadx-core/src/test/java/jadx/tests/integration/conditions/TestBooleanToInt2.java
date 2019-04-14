package jadx.tests.integration.conditions;

import org.junit.jupiter.api.Test;

import jadx.NotYetImplemented;
import jadx.core.dex.nodes.ClassNode;
import jadx.tests.api.SmaliTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TestBooleanToInt2 extends SmaliTest {

	//@formatter:off
	/**
		private boolean showConsent;

		public void write(int b) {
		}

		public void writeToParcel(TestBooleanToInt2 testBooleanToInt2) {
			testBooleanToInt2.write(this.showConsent ? 1 : 0);
		}
	*/
	//@formatter:on
	@Test
	@NotYetImplemented
	public void test() {
		ClassNode cls = getClassNodeFromSmaliWithPath("conditions", "TestBooleanToInt2");
		String code = cls.getCode().toString();

		assertThat(code, containsString("write(this.showConsent ? 1 : 0);"));
	}
}
