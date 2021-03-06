package pattern.bridge;

/**
 * @author otahiri
 * 
 *         Bridge is used when we need to decouple an abstraction from its
 *         implementation so that the two can vary independently. This type of
 *         design pattern comes under structural pattern as this pattern
 *         decouples implementation class and abstract class by providing a
 *         bridge structure between them.
 * 
 *         This pattern involves an interface which acts as a bridge which makes
 *         the functionality of concrete classes independent from interface
 *         implementer classes. Both types of classes can be altered
 *         structurally without affecting each other.
 */
public class BridgePatternMain {

	public static void main(String[] args) {
		Bank icici = new IciciBank(new CurrentAccount());
		Account current = icici.openAccount();
		current.accountType();

		Bank hdfc = new HdfcBank(new SavingAccount());
		Account saving = hdfc.openAccount();
		saving.accountType();
	}

}
