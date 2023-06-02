// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Name("torch::jit::Node") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JitNode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JitNode(Pointer p) { super(p); }

  
  
  // Each Node but Return/Param Nodes are associated with exactly one
  // place in the Node list of the Graph. The Graph itself is a circular
  // doubly-linked list. The Return Node is used as the sentinel for the
  // "beginning"/"end" of the list. This means that you can tell when
  // you've traversed the entire list without means worrying about null
  // pointers. `next_in_graph[0]` is the pointer to the next Node, while
  // `next_in_graph[1]` is the pointer to the previous Node. The
  // linked list is implemented as an array to allow the same iterator
  // class for forward and reversed Node lists. Taken together, this
  // list also represents a topological sort of the Nodes in the Graph.
  // NOLINTNEXTLINE(cppcoreguidelines-avoid-c-arrays,cppcoreguidelines-non-private-member-variables-in-classes,modernize-avoid-c-arrays)
  public native JitNode next_in_graph(int i); public native JitNode next_in_graph(int i, JitNode setter);
  @MemberGetter public native @Cast("torch::jit::Node**") PointerPointer next_in_graph();

  public native @SharedPtr JitNodeWrap wrap();

  public native @Const @ByVal StringOptional getHistoricSchemaName();

  public native void setHistoricSchemaName(@StdString BytePointer name);
  public native void setHistoricSchemaName(@StdString String name);

  public native @ByPtrRef JitNode next();
  public native @ByPtrRef JitNode prev();

  public native @ByVal @Cast("torch::jit::NodeKind*") Symbol kind();
  public native JitNode setSourceRange(@ByVal SourceRange r);
  public native @ByVal SourceRange sourceRange();

  /**
   * \warning NEVER pass raw pointer of smart pointer managed Graph to Python.
   * Check #87343 for details.
   */
  public native Graph owningGraph();
  public native Block owningBlock();
  public native @ByVal @Cast("torch::jit::ScopePtr*") Pointer scope();
  public native void setScope(@ByVal @Cast("torch::jit::ScopePtr*") Pointer scope);
  public native @StdString BytePointer scopeName();

  // Copies the source range, scope and callstack from another node.
  public native JitNode copyMetadata(JitNode from);

  public native @ByVal @Cast("c10::optional<torch::jit::InlinedCallStackPtr>*") InlinedCallStackOptional callstack();
  public native void setCallStack(@ByVal @Cast("torch::jit::InlinedCallStackPtr*") Pointer cs);

  // NB: This returns an ArrayRef; that means that it will
  // get invalidated if you resize inputs (e.g., using addInput)
  // We can't return a std::vector<Node*>& because there's no
  // way to soundly cast to std::vector<const Node*> (an insane
  // implementation of std::vector could make this representationally
  // different.)
  public native @ByVal ValueArrayRef inputs();
  // NB: This returns an ArrayRef; that means that it will
  // get invalidated if you resize inputs (e.g., using addInput)
  // We can't return a std::vector<Node*>& because there's no
  // way to soundly cast to std::vector<const Node*> (an insane
  // implementation of std::vector could make this representationally
  // different.)
  public native @ByVal ValueArrayRef outputs();
  public native Value output(@Cast("size_t") long i);
  public native @Cast("bool") boolean hasUses();

  public native void replaceAllUsesWith(JitNode n);

  // replaces `this` with a new node with the same inputs and outputs
  // but a new node symbol. does not destroy `this`
  public native JitNode replaceWithNewSymbol(@ByVal Symbol new_symbol);

  // Checks if this node is dominated by `dominator` which means that
  // `dominator` will always be executed before `this` and `dominator`
  // is in scope of `this.
  public native @Cast("bool") boolean isDominatedBy(@Const JitNode dominator);

  // lots of things like chunk have a single input or single output, so we have
  // a helper to make accessing it easier
  public native Value input();
  public native Value output();
  // Access a particular input.  This is a checked index.
  public native Value input(@Cast("size_t") long i);

  public native @Cast("bool") boolean hasNamedInput(@StdString BytePointer unqualName);
  public native @Cast("bool") boolean hasNamedInput(@StdString String unqualName);
  public native Value namedInput(@StdString BytePointer unqualName);
  public native Value namedInput(@StdString String unqualName);
  public native Value namedInput(@ByVal Symbol name);

  public native @ByVal IValueOptional get(@ByVal Symbol name);

  // Returns true if the value of input name is statically known
  public native @Cast("bool") boolean is_constant(@ByVal Symbol name);
  public native @Cast("bool") boolean mustBeNone();

  public native @Cast("bool") boolean isNondeterministic();
  public native @Cast("bool") boolean hasSideEffects();

  // instructions lowered by the interpreter and not run in the optimized graph
  public native @Cast("bool") boolean notExecutedOp();

  // Graphs

  // Note [Topological invariant]
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // We always maintain an up-to-date topological ordering of all nodes via
  // the next()/prev() links.  All transformations to graphs must preserve
  // this topological ordering: for example, it is only valid to 'addInput'
  // with an input which is topologically before the current node.
  //
  // Usually, it is obvious whether or not topological order is maintained;
  // for example, if you are adding nodes to the end of the topsort, it's
  // impossible for them to refer to inputs that are not in the topsort.
  // If it is not obvious, please comment accordingly.

  // Add 'node' as an input to 'this' at the end of existing
  // arguments.  Returns the added node for ease of chaining.
  //
  // Given:   %3 = f(%1, %2)
  // Execute: %3.addInput(%4)
  // Result:  %3 = f(%1, %2, %4)
  public native Value addInput(Value value);

  // Add 'value' as an input to 'this' at the specified position in the
  // arguments. Returns the added value for ease of chaining.
  public native Value insertInput(@Cast("size_t") long i, Value value);

  // Replace the input of 'this' at position 'i' with
  // 'newValue', returning the old node.
  //
  // Given:   %3 = f(%1, %2)
  // Execute: %3.replaceInput(1, %4)
  // Result:  %3 = f(%1, %4)
  public native Value replaceInput(@Cast("size_t") long i, Value newValue);

  // Replace all occurrences of 'from' in the inputs of this
  // node with 'to'. Corresponds to llvm's replaceUsesOfWith.
  //
  // Given:   %3 = f(%1, %2, %1)
  // Execute: %3.replaceInputWith(%1, %4)
  // Result:  %3 = f(%4, %2, %4)
  public native void replaceInputWith(Value from, Value to);

  public native Value addOutput();

  public native Value insertOutput(@Cast("size_t") long i);

  public native void eraseOutput(@Cast("size_t") long i);

  public native Block addBlock();
  public native void eraseBlock(@Cast("size_t") long i);

  // Each Node can have a list of subblocks. These are used to define structured
  // nested control flow operators such as If and Loop.
  // The meaning of a block is specific to the kind of node it is in, but
  // all blocks share these semantics:
  // * Nested lexical scoping: If a node 'Parent' has a subblock which contains
  //   a node 'Child', Child can use any value that was in scope for the Parent
  //   node in addition to any values defined before 'Child' in the subblock.
  // * The list of inputs to the block are in scope for the duration of the
  //   block
  // * the outputs of the Parent node are not in scope for the subblocks
  // Typically the inputs to a block that represents control flow act as
  // as the equivalents phi-nodes in standard SSA form,
  // defining a new Value to represent any term that has multiple
  // definitions depending on how control flowed. Outputs of the node containing
  // control flow serve a similiar purpose defining new values for variables
  // that would have different definitions depending on which way control
  // flowed.

  public native @ByVal BlockArrayRef blocks();

  // Is 'this' before 'n' in the topological order?
  public native @Cast("bool") boolean isBefore(@Const JitNode n);

  // Is 'this' after 'n' in the topological order?
  public native @Cast("bool") boolean isAfter(@Const JitNode n);

  // Insert unattached 'this' node before 'n' in the topological order.
  // Returns this (for chaining).
  //
  // Given:   %3 = f(%1, %2)
  //          %4 = g(%3)
  // and unattached: %5 = h(%1)
  // Execute: %5.insertBefore(%4)
  // Result:  %3 = f(%1, %2)
  //          %5 = h(%1)
  //          %4 = g(%3)
  public native JitNode insertBefore(JitNode n);

  // Insert unattached 'this' node after 'n' in the topological order.
  // Returns this (for chaining).
  //
  // Given: %3 = f(%1, %2)
  //        %4 = g(%3)
  // and unattached: %5 = h(%1)
  // Execute: %5.insertAfter(%4)
  // Result:  %3 = f(%1, %2)
  //          %4 = g(%3)
  //          %5 = h(%1)
  public native JitNode insertAfter(JitNode n);

  // Move 'this' (already in the graph) after 'n' in the topological order.
  //
  // NOTE: Does not check that value dependencies are preserved, see
  //   AliasDb::moveAfterTopologicallyValid
  //
  // Given: %2 = f(%1)
  //        %3 = g(%1)
  // Execute: %2.moveAfter(%3)
  // Result: %3 = g(%1)
  //         %2 = f(%1)
  //
  public native void moveAfter(JitNode n);

  // Move a node 'n' (already in the graph) before 'this' in the topological
  // order.
  //
  // NOTE: Does not check that value dependencies are preserved, see
  //   AliasDb::moveBeforeTopologicallyValid
  //
  // Given: %2 = f(%1)
  //        %3 = g(%1)
  // Execute: %3.moveBefore(%2)
  // Result: %3 = g(%1)
  //         %2 = f(%1)
  public native void moveBefore(JitNode n);

  // Remove the input at 'i' from this node.
  //
  // WARNING: This is O(n) in the number of inputs, so avoid repeatedly calling
  // removeInput.
  //
  // Given: %3 = f(%1, %2)
  // Execute: %3.removeInput(1)
  // Result: %3 = f(%1)
  public native void removeInput(@Cast("size_t") long i);

  // Remove all inputs from a node.
  //
  // Given: %3 = f(%1, %2)
  // Execute: %3.removeAllInputs()
  // Result: %3 = f()
  public native void removeAllInputs();

  // Remove all outputs from a node.
  //
  // Given: %1, %2 = f()
  // Execute:removeAllInputs()
  // Result: = f()
  public native void removeAllOutputs();

  // Rearrange the ordering of inputs or outputs of a node
  // Given: %3 = f(%1, %2)
  // Execute: %3.permuteInputs({1, 0})
  // Result: %3 = f(%2, %1)
  // Each index must appear exactly once
  public native void permuteInputs(@Cast("const std::vector<size_t>*") @ByRef SizeTVector new_inputs);
  public native void permuteOutputs(@Cast("const std::vector<size_t>*") @ByRef SizeTVector new_inputs);

  // iterators of the node list starting at this node
  // useful for resuming a search starting at this node
  public native @ByVal graph_node_list_iterator iterator();
  public native @ByVal graph_node_list_iterator reverseIterator();

  // Remove 'this' from the instruction list and deallocate it.
  //
  // Invariant: no outputs of 'this' may have any uses.
  //
  // Given: %2 = f(%1)
  //        %3 = g(%1)
  // Execute: %2.destroy()
  // Result: %3 = g(%1)
  public native void destroy();

  // Dynamically cast this node to the subclass indicated by the
  // template variable, returning nullptr if the cast is invalid..
  //
  // Example usage: if(auto s = n.cast<Select>()) { ... }

  public native @Cast("bool") boolean matches(@Const @ByRef FunctionSchema schema);

  // XXX: this function is meant to be used with string literals only!
  public native @Cast("bool") boolean matches(
        @Cast("const char*") BytePointer signature_literal,
        @ByVal(nullValue = "at::ArrayRef<c10::Symbol>{}") SymbolArrayRef const_inputs);
  public native @Cast("bool") boolean matches(
        @Cast("const char*") BytePointer signature_literal);
  public native @Cast("bool") boolean matches(
        String signature_literal,
        @ByVal(nullValue = "at::ArrayRef<c10::Symbol>{}") SymbolArrayRef const_inputs);
  public native @Cast("bool") boolean matches(
        String signature_literal);

  public native @Cast("bool") boolean isMemberOf(@Const @ByRef OperatorSet os);

  public native @Const @ByRef FunctionSchema schema();
  public native @Const FunctionSchema maybeSchema();
  public native @Const @ByRef Operator getOperator();
  public native @ByVal Operation getOperation();

  public native @Const Operator maybeOperator();

  public native void dump();

  public native @Cast("std::ostream*") @ByRef Pointer print(
        @Cast("std::ostream*") @ByRef Pointer out,
        @Cast("size_t") long level,
        JitNodeVector groups,
        @Cast("bool") boolean print_source_locations/*=true*/,
        @Cast("bool") boolean print_attributes/*=true*/,
        @Cast("bool") boolean print_scopes/*=true*/,
        @Cast("bool") boolean print_body/*=true*/);
  public native @Cast("std::ostream*") @ByRef Pointer print(
        @Cast("std::ostream*") @ByRef Pointer out,
        @Cast("size_t") long level,
        JitNodeVector groups);

  // Methods for accessing attributes
  public native JitNode copyAttributes(@Const @ByRef JitNode rhs);
  public native @Cast("bool") boolean hasAttribute(@ByVal Symbol name);
  public native @Cast("bool") boolean hasAttributeS(@StdString BytePointer name);
  public native @Cast("bool") boolean hasAttributeS(@StdString String name);
  public native JitAttributeKind kindOf(@ByVal Symbol name);
  public native JitAttributeKind kindOfS(@StdString BytePointer name);
  public native JitAttributeKind kindOfS(@StdString String name);
  public native JitNode removeAttribute(@ByVal Symbol name);
  public native JitNode removeAttributeS(@StdString BytePointer name);
  public native JitNode removeAttributeS(@StdString String name);
  public native @Cast("bool") boolean hasAttributes();
  public native @Cast("size_t") long numAttributes();
  // The names are returned in order, since name actually is the index.
  public native @ByVal SymbolVector attributeNames();
  public native @ByVal BytePointerVector attributeNamesS();

// #define CREATE_ACCESSOR(Kind, method)
//   Node* method##_(Symbol name, Kind##Attr::ConstructorType v) {
//     return setAttr<Kind##Attr>(
//         name, std::forward<Kind##Attr::ConstructorType>(v));
//   }
//   const Kind##Attr::ValueType& method(Symbol name) const {
//     return getAttr<Kind##Attr>(name);
//   }

  public native JitNode f_(@ByVal Symbol name, @Cast("torch::jit::FloatAttr::ConstructorType") double v);
  public native @Cast("const torch::jit::FloatAttr::ValueType") double f(@ByVal Symbol name);
  public native JitNode c_(@ByVal Symbol name, @ByVal @Cast("torch::jit::ComplexAttr::ConstructorType*") DoublePointer v);
  public native @Cast("const torch::jit::ComplexAttr::ValueType*") @ByRef DoublePointer c(@ByVal Symbol name);
  public native JitNode fs_(@ByVal Symbol name, @ByVal @Cast("torch::jit::FloatsAttr::ConstructorType*") DoubleVector v);
  public native @Cast("const torch::jit::FloatsAttr::ValueType*") @ByRef DoubleVector fs(@ByVal Symbol name);
  public native JitNode cs_(@ByVal Symbol name, @ByVal @Cast("torch::jit::ComplexValsAttr::ConstructorType*") Pointer v);
  public native @Cast("const torch::jit::ComplexValsAttr::ValueType*") @ByRef Pointer cs(@ByVal Symbol name);
  public native JitNode s_(@ByVal Symbol name, @StdString @ByVal BytePointer v);
  public native @Const @StdString @ByRef BytePointer s(@ByVal Symbol name);
  public native JitNode ss_(@ByVal Symbol name, @ByVal @Cast("torch::jit::StringsAttr::ConstructorType*") StringVector v);
  public native @Cast("const torch::jit::StringsAttr::ValueType*") @ByRef StringVector ss(@ByVal Symbol name);
  public native JitNode i_(@ByVal Symbol name, @Cast("torch::jit::IntAttr::ConstructorType") long v);
  public native @Cast("const torch::jit::IntAttr::ValueType") long i(@ByVal Symbol name);
  public native JitNode is_(@ByVal Symbol name, @ByVal @Cast("torch::jit::IntsAttr::ConstructorType*") LongVector v);
  public native @Cast("const torch::jit::IntsAttr::ValueType*") @ByRef LongVector is(@ByVal Symbol name);
  public native JitNode g_(@ByVal Symbol name, @SharedPtr @ByVal Graph v);
  public native JitNode gs_(@ByVal Symbol name, @ByVal @Cast("torch::jit::GraphsAttr::ConstructorType*") GraphVector v);
  public native @Cast("const torch::jit::GraphsAttr::ValueType*") @ByRef GraphVector gs(@ByVal Symbol name);
  public native JitNode ty_(@ByVal Symbol name, @ByVal @Cast("torch::jit::TypeAttr::ConstructorType*") Type.TypePtr v);
  public native @Cast("const torch::jit::TypeAttr::ValueType*") @ByRef Type.TypePtr ty(@ByVal Symbol name);
  public native JitNode tys_(@ByVal Symbol name, @ByVal @Cast("torch::jit::TypesAttr::ConstructorType*") TypeVector v);
  public native @Cast("const torch::jit::TypesAttr::ValueType*") @ByRef TypeVector tys(@ByVal Symbol name);
  public native JitNode ival_(@ByVal Symbol name, @ByVal @Cast("torch::jit::IValueAttr::ConstructorType*") IValue v);
  public native @Cast("const torch::jit::IValueAttr::ValueType*") @ByRef IValue ival(@ByVal Symbol name);

// #undef CREATE_ACCESSOR

  // Our Graphs are not very const-correct, so we need to allow returning
  // non-const references too
  public native @SharedPtr @ByRef Graph g(@ByVal Symbol name);

  // does not use CREATE_ACCESSOR because we need additional asserts
  public native JitNode t_(@ByVal Symbol name, @ByVal @Cast("torch::jit::TensorAttr::ConstructorType*") Tensor v);
  public native @Cast("const torch::jit::TensorAttr::ValueType*") @ByRef Tensor t(@ByVal Symbol name);

  public native JitNode ts_(@ByVal Symbol name, @ByVal @Cast("torch::jit::TensorsAttr::ConstructorType*") TensorVector v);
  public native @Cast("const torch::jit::TensorsAttr::ValueType*") @ByRef TensorVector ts(@ByVal Symbol name);

  public native Block findCommonAncestorBlockWith(JitNode n);

  public native @Cast("size_t") long blocksFromGraphBlock();
}
