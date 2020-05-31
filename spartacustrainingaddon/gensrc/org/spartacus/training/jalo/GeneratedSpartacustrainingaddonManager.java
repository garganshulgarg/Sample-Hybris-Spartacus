/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 31, 2020, 1:50:00 PM                    ---
 * ----------------------------------------------------------------
 */
package org.spartacus.training.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import org.spartacus.training.components.SpartacusHeroBannerComponent;
import org.spartacus.training.constants.SpartacustrainingaddonConstants;

/**
 * Generated class for type <code>SpartacustrainingaddonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSpartacustrainingaddonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public SpartacusHeroBannerComponent createSpartacusHeroBannerComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SpartacustrainingaddonConstants.TC.SPARTACUSHEROBANNERCOMPONENT );
			return (SpartacusHeroBannerComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SpartacusHeroBannerComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SpartacusHeroBannerComponent createSpartacusHeroBannerComponent(final Map attributeValues)
	{
		return createSpartacusHeroBannerComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SpartacustrainingaddonConstants.EXTENSIONNAME;
	}
	
}
