package cs3500.pa05.view;

import cs3500.pa05.controller.Controller;
import cs3500.pa05.model.Config;
import cs3500.pa05.model.Day;
import cs3500.pa05.model.Entry;
import cs3500.pa05.model.Event;
import cs3500.pa05.model.Task;
import java.lang.reflect.Executable;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public interface GUIView {
  void showTasks(VBox vbox, List<Task> tasks, EntryGUIContainerFactory factory);
  void showEvents(VBox vbox, List<Event> events, EntryGUIContainerFactory factory);
  void newTaskPrompt(Consumer<Entry> taskAdder, Function<Day, Boolean> limitChecker);
  void newTaskPrompt(Task task, Consumer<Entry> taskAdder, Function<Day, Boolean> limitChecker);

  void newEventPrompt(Event event, Consumer<Entry> eventAdder, Function<Day, Boolean> limitChecker);

  void newEventPrompt(Consumer<Entry> eventAdder, Function<Day, Boolean> limitChecker);

  void showSettingsPrompt(Config config);

  void showTaskPanel();

  void setGUIUpdater(Runnable updater);

  Scene load(Controller controller);

}
