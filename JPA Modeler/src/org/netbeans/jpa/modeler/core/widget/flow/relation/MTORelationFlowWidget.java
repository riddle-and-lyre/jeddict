/**
 * Copyright [2014] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jpa.modeler.core.widget.flow.relation;

import org.netbeans.jpa.modeler.specification.model.scene.JPAModelerScene;
import static org.netbeans.jpa.modeler.specification.model.util.JPAModelerUtil.MTOR_SOURCE_ANCHOR_SHAPE;
import static org.netbeans.jpa.modeler.specification.model.util.JPAModelerUtil.MTOR_TARGET_ANCHOR_SHAPE;
import org.netbeans.modeler.anchorshape.IconAnchorShape;
import org.netbeans.modeler.widget.edge.info.EdgeWidgetInfo;

/**
 *
 * @author Gaurav Gupta
 */
public abstract class MTORelationFlowWidget extends HierarchicalRelationFlowWidget {

    private static final IconAnchorShape SOURCE_ANCHOR_SHAPE = new IconAnchorShape(MTOR_SOURCE_ANCHOR_SHAPE, true);
    private static final IconAnchorShape TARGET_ANCHOR_SHAPE = new IconAnchorShape(MTOR_TARGET_ANCHOR_SHAPE, true);

    public MTORelationFlowWidget(JPAModelerScene scene, EdgeWidgetInfo edge) {
        super(scene, edge);
        setSourceAnchorShape(SOURCE_ANCHOR_SHAPE);
        setTargetAnchorShape(TARGET_ANCHOR_SHAPE);
    }

}
