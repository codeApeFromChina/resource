/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * Event raised when an <code>ApplicationContext</code> gets started.
 *
 * @author Mark Fisher
 * @author Juergen Hoeller
 * @since 2.5
 * @see ContextStoppedEvent
 */
public class ContextStartedEvent extends ApplicationContextEvent {

	/**
	 * Create a new ContextStartedEvent.
	 * @param source the <code>ApplicationContext</code> that has been started
	 * (must not be <code>null</code>)
	 */
	public ContextStartedEvent(ApplicationContext source) {
		super(source);
	}

}
