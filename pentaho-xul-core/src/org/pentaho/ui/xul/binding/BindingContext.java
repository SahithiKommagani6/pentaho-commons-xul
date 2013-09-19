package org.pentaho.ui.xul.binding;

import org.pentaho.ui.xul.XulComponent;

public interface BindingContext {

  public abstract void add(XulComponent source, String expr);

  public abstract void remove(Binding bind);

  /*
   * 1. inits the binding defined by the bind object
   * 2. registers binding listeners
   */
  public abstract void add(Binding bind);

  public abstract void addInitializedBinding(Binding binding);

}
