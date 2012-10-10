package org.exoplatform.social.spacemanagement;

import juzu.Path;
import juzu.View;
import juzu.template.Template;

import javax.inject.Inject;
import java.io.IOException;

/**
 * 
 * @author hanhvq
 *
 * Oct 9, 2012
 */
public class Controller {

  @Inject
  @Path("index.gtmpl")
  Template index;


  @View
  public void index() throws IOException {
    index.render();
  }
}
