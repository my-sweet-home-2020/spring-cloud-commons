/*
 * Copyright 2013-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.util;

import org.springframework.core.env.Environment;

public abstract class PropertyUtils {

	/**
	 * Property name for checking if bootstrap is enabled.
	 */
	public static final String BOOTSTRAP_ENABLED_PROPERTY = "spring.cloud.bootstrap.enabled";

	/**
	 * Property name for spring boot legacy processing.
	 */
	public static final String USE_LEGACY_PROCESSING_PROPERTY = "spring.config.use-legacy-processing";

	private PropertyUtils() {

	}

	public static boolean bootstrapEnabled(Environment environment) {
		return environment.getProperty(BOOTSTRAP_ENABLED_PROPERTY, Boolean.class, false);
	}

	public static boolean useLegacyProcessing(Environment environment) {
		return environment.getProperty(USE_LEGACY_PROCESSING_PROPERTY, Boolean.class,
				false);
	}

}
