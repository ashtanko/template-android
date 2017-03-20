package io.shtanko.basetemplate.data.repository;

import io.shtanko.basetemplate.data.model.Action;
import java.util.List;

public interface ActionRepository {
  List<Action> getActions();
}
