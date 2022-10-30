// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    /** Nodes are the backbone of the graph of Value dataflow. Every node has
     *  zero or more nodes as arguments and one value, which is either a tensor
     *  or a (possibly empty) tuple of values. */
    @Namespace("ngraph") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Node extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Node(Pointer p) { super(p); }
    

        /** Sets/replaces the arguments with new arguments. */
        public native void set_arguments(@Const @ByRef NodeVector arguments);
        /** Sets/replaces the arguments with new arguments. */
        public native void set_arguments(@Cast("const ngraph::OutputVector*") @ByRef NodeOutputVector arguments);
        /** Sets/replaces the arguments with new arguments. */
        public native void set_argument(@Cast("size_t") long _position, @Const @ByRef NodeOutput argument);

        /** Sets the number of outputs */
        public native void set_output_size(@Cast("size_t") long output_size);

        public native void revalidate_and_infer_types();
        // Called after transition
        public native void delayed_validate_and_infer_types();

        /** \brief Get the string name for the type of the node, such as {@code Add} or {@code Multiply}.
         *         The class name, must not contain spaces as it is used for codegen.
         *  @return A const reference to the node's type name */
        public native @StdString BytePointer description();
        /** \brief Get the unique name of the node.
         *  @return A const reference to the node's unique name. */
        public native @StdString BytePointer get_name();

        /** \brief Sets a friendly name for a node. This does not overwrite the unique name
         *         of the node and is retrieved via get_friendly_name(). Used mainly for debugging.
         *         The friendly name may be set exactly once.
         *  @param name is the friendly name to set */
        public native void set_friendly_name(@StdString BytePointer name);
        public native void set_friendly_name(@StdString String name);

        /** \brief Gets the friendly name for a node. If no friendly name has been set via
         *         set_friendly_name then the node's unique name is returned.
         *  @return A const reference to the node's friendly name. */
        public native @StdString BytePointer get_friendly_name();

        /** Return true if this has the same implementing class as node. This
         *  will be used by the pattern matcher when comparing a pattern
         *  graph against the graph. */
        
        ///
        public native @Cast("bool") boolean is_same_op_type(@Const @SharedPtr @ByRef Node node);

        /** \brief Marks an input as being relevant or irrelevant to the output shapes of this
         *         node.
         *  @param i The index of the input to mark as relevant or irrelevant.
         *  @param relevant true if the input is relevant to output shapes, false otherwise.
         * 
         *  This is used by the shape specialization pass to know which nodes must be statically
         *  evaluated in order to complete shape specialization. (For example, the shape input of
         *  DynReshape must be evaluated statically in order for the output shape to be
         *  determined.) By default, all inputs are marked as shape-irrelevant. Overrides of
         *  validate_and_infer_types should call this function to mark shape-relevant inputs. */
        // TODO(amprocte): should be protected
        
        ///
        public native void set_input_is_relevant_to_shape(@Cast("size_t") long i, @Cast("bool") boolean relevant/*=true*/);
        public native void set_input_is_relevant_to_shape(@Cast("size_t") long i);

        /** \brief Marks an input as being relevant or irrelevant to the output values of this
         *         node.
         *  @param i The index of the input to mark as relevant or irrelevant.
         *  @param relevant true if the input is relevant to output values, false otherwise.
         * 
         *  This is used by the shape specialization pass to cut short evaluation in cases where
         *  an input value does not actually have any effect on the output value of the node. (As
         *  of this writing, the only example of this is ShapeOf.) By default, all inputs are
         *  marked as value-relevant. Overrides of validate_and_infer_types should call this
         *  function to mark value-irrelevant inputs. */
        // TODO(amprocte): should be protected
        public native void set_input_is_relevant_to_value(@Cast("size_t") long i, @Cast("bool") boolean relevant/*=true*/);
        public native void set_input_is_relevant_to_value(@Cast("size_t") long i);

        // TODO(amprocte): should this be protected?
        public native void set_output_type(@Cast("size_t") long i,
                                     @Const @ByRef Type element_type,
                                     @Const @ByRef PartialShape pshape);

        public native @Cast("bool") boolean is_parameter();
        public native @Cast("bool") boolean is_output();
        public native @Cast("bool") boolean is_constant();
        public native @Cast("bool") boolean is_null();
        public native @Cast("bool") boolean is_op();
        public native @Cast("bool") boolean is_commutative();
        public native @Cast("bool") boolean is_dynamic();
        public native @Cast("bool") boolean has_state();
        public native @Cast("size_t") long get_instance_id();
        
        public native @Cast("std::ostream*") @ByRef Pointer write_short_description(@Cast("std::ostream*") @ByRef Pointer arg0);
        public native @Cast("std::ostream*") @ByRef Pointer write_long_description(@Cast("std::ostream*") @ByRef Pointer arg0);

        /** Get control dependencies registered on the node */
        public native @Const @ByRef NodeVector get_control_dependencies();

        /** Get nodes dependent on this node */
        public native @Cast("ngraph::Node**") @StdVector PointerPointer get_control_dependents();

        /** This node cannot execute until node executes */
        public native void add_control_dependency(@SharedPtr @ByVal Node node);

        /** Remove the dependency of this node on node */
        public native void remove_control_dependency(@SharedPtr @ByVal Node node);

        /** Remove all dependencies from this node */
        public native void clear_control_dependencies();

        /** Remove this node as a dependency from all dependent nodes */
        public native void clear_control_dependents();

        /** This node absorbs the control dependencies of source_node */
        public native void add_node_control_dependencies(@SharedPtr @ByVal Node source_node);

        /** This node becomes a dependent of every node dependent on source_node */
        public native void add_node_control_dependents(@SharedPtr @ByVal Node source_node);

        /** Returns the number of outputs from the node. */
        public native @Cast("size_t") long get_output_size();

        /** Returns the element type for output i */
        // TODO: deprecate in favor of node->output(i).get_element_type()
        public native @Const @ByRef Type get_output_element_type(@Cast("size_t") long i);

        /** Checks that there is exactly one output and returns its element type */
        // TODO: deprecate in favor of node->output(0).get_element_type() with a suitable check in
        // the calling code, or updates to the calling code if it is making an invalid assumption
        // of only one output.
        public native @Const @ByRef Type get_element_type();

        /** Returns the shape for output i */
        // TODO: deprecate in favor of node->output(i).get_shape()
        public native @Const @ByRef Shape get_output_shape(@Cast("size_t") long i);

        /** Returns the partial shape for output i */
        public native @Const @ByRef PartialShape get_output_partial_shape(@Cast("size_t") long i);

        public native @SharedPtr @ByVal Node get_output_as_single_output_node(@Cast("size_t") long i,
                                                                       @Cast("bool") boolean for_get_output_element/*=true*/);
        public native @SharedPtr @ByVal Node get_output_as_single_output_node(@Cast("size_t") long i);

        /** Checks that there is exactly one output and returns its shape */
        // TODO: deprecate in favor of node->output(0).get_shape() with a suitable check in the
        // calling code, or updates to the calling code if it is making an invalid assumption of
        // only one output.
        public native @Const @ByRef Shape get_shape();

        /** Returns the tensor for output i */
        public native @ByRef DescriptorTensor get_output_tensor(@Cast("size_t") long i);

        /** Returns the tensor name for output i */
        public native @StdString BytePointer get_output_tensor_name(@Cast("size_t") long i);

        /** Checks that there is exactly one output and returns its tensor. */
        public native @ByRef DescriptorTensor get_output_tensor();

        /** Returns the tensor of output i */
        // TODO: Investigate whether this really needs to be shared_ptr. If so, we'll need a
        // replacement in Output.
        public native @SharedPtr @ByVal DescriptorTensor get_output_tensor_ptr(@Cast("size_t") long i);

        /** Checks that there is exactly one output and returns its tensor. */
        public native @SharedPtr @ByVal DescriptorTensor get_output_tensor_ptr();

        /** Returns the set of inputs using output i */
        public native @Const @ByRef DescriptorInputVector get_output_inputs(@Cast("size_t") long i);

        /** Returns the number of inputs for the op */
        public native @Cast("size_t") long get_input_size();

        /** Returns the element type of input i */
        // TODO: deprecate in favor of node->input(i).get_element_type()
        public native @Const @ByRef Type get_input_element_type(@Cast("size_t") long i);

        /** Returns the shape of input i */
        // TODO: deprecate in favor of node->input(i).get_shape()
        public native @Const @ByRef Shape get_input_shape(@Cast("size_t") long i);

        /** Returns the partial shape of input i */
        // TODO: deprecate in favor of node->input(i).get_partial_shape()
        public native @Const @ByRef PartialShape get_input_partial_shape(@Cast("size_t") long i);

        /** Returns the tensor name for input i */
        public native @StdString BytePointer get_input_tensor_name(@Cast("size_t") long i);

        // Will be deprecated
        public native @ByVal NodeVector get_arguments();
        // Will be deprecated
        public native @SharedPtr @ByVal Node get_argument(@Cast("size_t") long index);
        public native @SharedPtr @ByVal Node copy_with_new_inputs(@Cast("const ngraph::OutputVector*") @ByRef NodeOutputVector new_args);

        public native @SharedPtr @ByVal Node copy_with_new_inputs(
                    @Cast("const ngraph::OutputVector*") @ByRef NodeOutputVector inputs,
                    @Const @ByRef NodeVector control_dependencies);

        /** True if this and node have one output with same element type and shape */
        

        /** Get device placement */
        public native @Cast("ngraph::Placement") int get_placement();

        /** Set device placement */
        public native void set_placement(@Cast("ngraph::Placement") int placement);

        /** Get device placement */
        public native @Cast("size_t") long get_placement_index();

        /** Set device placement */
        public native void set_placement_index(@Cast("size_t") long placement);
        public native void add_provenance_tag(@StdString BytePointer tag);
        public native void add_provenance_tag(@StdString String tag);
        /** \brief Adds tag_set to this node and all intermediate nodes above base */
        public native void remove_provenance_tag(@StdString BytePointer tag);
        public native void remove_provenance_tag(@StdString String tag);
        /** \brief Add node to additional nodes that receive tags */
        public native void add_provenance_group_member(@Const @SharedPtr @ByRef Node node);
        /** \brief Add all nodes between this node and nodes in base as additional nodes to receive
         *  provenance tags. */
        public native @SharedPtr @ByVal Node add_provenance_group_members_above(@Cast("const ngraph::OutputVector*") @ByRef NodeOutputVector base);

        // to be used when nodes are replaced
        public native void merge_provenance_tags_from(@Const @Cast("const ngraph::Node*") @SharedPtr @ByRef Node source);

        /** Get all the nodes that uses the current node */
        public native @ByVal NodeVector get_users(@Cast("bool") boolean check_is_used/*=false*/);
        public native @ByVal NodeVector get_users();

        /** @return Version of this node */
        public native @Cast("size_t") long get_version();
        public native @SharedPtr @ByVal Node get_default_value();
        /** Use instance ids for comparison instead of memory addresses to improve determinism */
        public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef Node other);
        @MemberGetter public static native @Cast("const size_t") long placement_invalid();
        public static final long placement_invalid = placement_invalid();

        /** @return A vector containing a handle for each of this node's inputs, in order. */
        // TODO: Rename to get_inputs()?
        public native @ByVal NodeInputVector inputs();

        /** @return A vector containing a handle for each of this node's inputs, in order. */

        /** @return A vector containing the values for each input */
        public native @ByVal NodeOutputVector input_values();

        /** @return A vector containing a handle for each of this node's outputs, in order. */
        // TODO: Rename to get_outputs()?
        public native @ByVal NodeOutputVector outputs();

        /** @return A vector containing a handle for each of this node's outputs, in order. */

        /** @return A handle to the {@code input_index}th input of this node.
         *  @throws std::out_of_range if the node does not have at least {@code input_index+1} inputs. */
        public native @ByVal NodeInput input(@Cast("size_t") long input_index);

        /** @return A handle to the {@code input_index}th input of this node.
         *  @throws std::out_of_range if the node does not have at least {@code input_index+1} inputs. */

        public native @ByVal NodeOutput input_value(@Cast("size_t") long input_index);

        /** @return A handle to the {@code output_index}th output of this node.
         *  @throws std::out_of_range if the node does not have at least {@code output_index+1} outputs. */
        public native @ByVal NodeOutput output(@Cast("size_t") long output_index);

        /** @return A handle to the {@code output_index}th output of this node.
         *  @throws std::out_of_range if the node does not have at least {@code output_index+1} outputs. */
    }
