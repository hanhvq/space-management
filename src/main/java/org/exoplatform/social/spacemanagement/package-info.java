@Application 
@Portlet 
@Bindings({
  @Binding(value = SpaceService.class, implementation = ServiceProvider.class)
})

package org.exoplatform.social.spacemanagement;

import juzu.Application;
import juzu.plugin.binding.Binding;
import juzu.plugin.binding.Bindings;
import juzu.plugin.portlet.Portlet;

import org.exoplatform.social.spacemanagement.providers.ServiceProvider;
import org.exoplatform.social.core.space.spi.SpaceService;