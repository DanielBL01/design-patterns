/**
 * Modern Chocolate factories have computer-controlled chocolate boilers. The job of these boilers is to take in
 * chocolate and milk, bring them to a boil, and then pass them on to the next phase of making chocolate bars.
 *
 * The following class is the controller class. Notice they've tried to be very careful to ensure that bad things
 * don't happen i.e. draining of unboiled mixture or filling the boiler when it's already full or boiling an empty
 * boiler. However, in the topic of Singleton Pattern, you may see that if two or more ChocolateBoiler instances
 * were to get loose, bad things may happen.
 */
public class ChocolateBoilerInit {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoilerInit() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isEmpty()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
