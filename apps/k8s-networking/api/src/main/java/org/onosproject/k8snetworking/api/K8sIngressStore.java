/*
 * Copyright 2019-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.k8snetworking.api;

import io.fabric8.kubernetes.api.model.extensions.Ingress;
import org.onosproject.store.Store;

import java.util.Set;

/**
 * Manages inventory of kubernetes ingresses; not intended for direct use.
 */
public interface K8sIngressStore
        extends Store<K8sIngressEvent, K8sIngressStoreDelegate> {

    /**
     * Creates the new kubernetes ingress.
     *
     * @param ingress kubernetes ingress
     */
    void createIngress(Ingress ingress);

    /**
     * Updates the kubernetes ingress.
     *
     * @param ingress kubernetes ingress
     */
    void updateIngress(Ingress ingress);

    /**
     * Removes the kubernetes ingress with the given ingress UID.
     *
     * @param uid kubernetes ingress UID.
     * @return removed kubernetes ingress; null if failed
     */
    Ingress removeIngress(String uid);

    /**
     * Returns the kubernetes ingress with the given ingress UID.
     *
     * @param uid kubernetes ingress UID
     * @return kubernetes ingress; null if not found
     */
    Ingress ingress(String uid);

    /**
     * Returns all kubernetes ingresses.
     *
     * @return set of kubernetes ingresses
     */
    Set<Ingress> ingresses();

    /**
     * Removes all kubernetes ingresses.
     */
    void clear();
}
